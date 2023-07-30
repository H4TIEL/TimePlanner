/*
 * Copyright 2023 Stanislav Aleshin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ru.aleshin.features.home.impl.navigation

import ru.aleshin.core.utils.navigation.Router
import ru.aleshin.features.editor.api.navigations.EditorFeatureStarter
import ru.aleshin.features.editor.api.navigations.EditorScreens
import ru.aleshin.features.home.api.domain.entities.schedules.TimeTask
import ru.aleshin.features.home.api.navigation.HomeScreens
import ru.aleshin.features.home.impl.di.annontation.LocalRouter
import ru.aleshin.features.home.impl.presentation.ui.categories.CategoriesScreen
import ru.aleshin.features.home.impl.presentation.ui.home.HomeScreen
import ru.aleshin.features.home.impl.presentation.ui.templates.TemplatesScreen
import javax.inject.Inject
import javax.inject.Provider

/**
 * @author Stanislav Aleshin on 23.02.2023.
 */
internal interface NavigationManager {

    fun navigateToLocal(screen: HomeScreens?, isRoot: Boolean = true)
    fun navigateToEditorFeature(timeTask: TimeTask, templateId: Int?)
    fun navigateToLocalBack()

    class Base @Inject constructor(
        @LocalRouter private val localRouter: Router,
        private val globalRouter: Router,
        private val editorFeatureStarter: Provider<EditorFeatureStarter>,
    ) : NavigationManager {

        override fun navigateToLocal(screen: HomeScreens?, isRoot: Boolean) = with(localRouter) {
            val screenInstance = when (screen) {
                HomeScreens.Home -> HomeScreen()
                HomeScreens.Templates -> TemplatesScreen()
                HomeScreens.Categories -> CategoriesScreen()
                else -> return@with
            }
            if (isRoot) replaceTo(screenInstance, true) else navigateTo(screenInstance)
        }

        override fun navigateToEditorFeature(timeTask: TimeTask, templateId: Int?) {
            val navScreen = EditorScreens.Editor(timeTask, templateId)
            val screen = editorFeatureStarter.get().provideEditorScreen(navScreen)
            globalRouter.navigateTo(screen)
        }

        override fun navigateToLocalBack() = localRouter.navigateBack()
    }
}
