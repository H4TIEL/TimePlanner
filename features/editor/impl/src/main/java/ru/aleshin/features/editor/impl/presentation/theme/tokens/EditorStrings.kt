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
package ru.aleshin.features.editor.impl.presentation.theme.tokens

import androidx.compose.runtime.staticCompositionLocalOf
import ru.aleshin.core.ui.theme.tokens.TimePlannerLanguage

/**
 * @author Stanislav Aleshin on 18.02.2023.
 */
internal data class EditorStrings(
    val topAppBarEditorTitle: String,
    val topAppBarBackIconDesc: String,
    val topAppBarMoreIconDesc: String,
    val topAppBarTemplatesTitle: String,
    val mainCategoryChooserTitle: String,
    val subCategoryChooserTitle: String,
    val mainCategoryChooserExpandedIconDesc: String,
    val categoryNotSelectedTitle: String,
    val subCategoryDialogAddedTitle: String,
    val subCategoryDialogMainCategoryFormat: String,
    val timeFieldStartLabel: String,
    val timeFieldEndLabel: String,
    val parameterChooserSwitchIconDesc: String,
    val timePickerHeader: String,
    val timePickerSeparator: String,
    val notifyParameterTitle: String,
    val notifyParameterDesc: String,
    val statisticsParameterTitle: String,
    val statisticsParameterDesc: String,
    val saveTaskButtonTitle: String,
    val cancelButtonTitle: String,
    val templateIconDesc: String,
    val topAppBarDeleteTitle: String,
    val categoryValidateError: String,
    val otherError: String,
    val startOverlayError: String,
    val endOverlayError: String,
    val fullOverlayError: String,
    val correctOverlayTitle: String,
    val durationPickerTitle: String,
    val templatesSheetTitle: String,
    val controlTitle: String,
    val applyTitle: String,
    val timeRangeFormat: String,
    val durationFormat: String,
    val notificationEnabledTitle: String,
    val notificationDisabledTitle: String,
    val emptyTemplatesTitle: String,
    val saveTemplateWarningTitle: String,
    val saveTemplateWarningConfirm: String,
    val saveTemplateWarningUnsave: String,
    val categoriesManageWarningTitle: String,
    val confirmNavigateTitle: String,
    val importantParameterTitle: String,
    val importantParameterDesc: String,
    val noteLabel: String,
    val notePlaceholder: String,
)

internal val russianHomeString = EditorStrings(
    topAppBarEditorTitle = "Редактор",
    topAppBarBackIconDesc = "Назад",
    topAppBarMoreIconDesc = "Дополнительно",
    topAppBarTemplatesTitle = "Шаблоны",
    mainCategoryChooserTitle = "Категория",
    subCategoryChooserTitle = "Подкатегория",
    mainCategoryChooserExpandedIconDesc = "Выбрать категорию",
    categoryNotSelectedTitle = "Отсутствует",
    subCategoryDialogAddedTitle = "Добавить",
    subCategoryDialogMainCategoryFormat = "Категория: %s",
    timeFieldStartLabel = "Старт",
    timeFieldEndLabel = "Конец",
    parameterChooserSwitchIconDesc = "Установить параметр",
    timePickerHeader = "Выберите время",
    timePickerSeparator = ":",
    notifyParameterTitle = "Уведомления",
    notifyParameterDesc = "Отправить уведомление при выполнении задачи",
    statisticsParameterTitle = "Статистика",
    statisticsParameterDesc = "Учитывать данные в статистике",
    saveTaskButtonTitle = "Сохранить",
    cancelButtonTitle = "Отменить",
    templateIconDesc = "Добавить в шаблоны",
    topAppBarDeleteTitle = "Удалить",
    categoryValidateError = "* Выберите категорию",
    otherError = "Ошибка! Обратитесь к разработчику.",
    startOverlayError = "Конфликт! Наложение старта задачи.",
    endOverlayError = "Конфликт! Наложение конца задачи.",
    fullOverlayError = "Конфликт! Наложение задач.",
    correctOverlayTitle = "Исправить",
    durationPickerTitle = "Длительность",
    templatesSheetTitle = "Шаблоны",
    controlTitle = "Управлять",
    applyTitle = "Применить",
    timeRangeFormat = "Время: С %S до %s",
    durationFormat = "Длительность: %s",
    notificationEnabledTitle = "Уведомления: включены",
    notificationDisabledTitle = "Уведомления: выключены",
    emptyTemplatesTitle = "Список пуст",
    saveTemplateWarningTitle = "Вы хотите применить изменения к текущему шаблону?",
    saveTemplateWarningConfirm = "Да",
    saveTemplateWarningUnsave = "Нет",
    categoriesManageWarningTitle = "Вы уверены что хотите перейти на экран управления категориями? " +
        "Текущие параметры останутся несохранёнными.",
    confirmNavigateTitle = "Перейти",
    importantParameterTitle = "Особый приоритет",
    importantParameterDesc = "Обязательное выполнение без возможности сдвига",
    noteLabel = "Заметка",
    notePlaceholder = "Небольшое примечание по желанию",
)

internal val englishHomeString = EditorStrings(
    topAppBarEditorTitle = "Editor",
    topAppBarBackIconDesc = "Back",
    topAppBarMoreIconDesc = "More",
    topAppBarTemplatesTitle = "Templates",
    mainCategoryChooserTitle = "Category",
    mainCategoryChooserExpandedIconDesc = "Select category",
    subCategoryChooserTitle = "Subcategory",
    categoryNotSelectedTitle = "Absent",
    subCategoryDialogAddedTitle = "Add",
    subCategoryDialogMainCategoryFormat = "Category: %s",
    timeFieldStartLabel = "Start",
    timeFieldEndLabel = "End",
    parameterChooserSwitchIconDesc = "Set parameter",
    timePickerHeader = "Enter time",
    timePickerSeparator = ":",
    notifyParameterTitle = "Notifications",
    notifyParameterDesc = "Send a notification when completing this task",
    statisticsParameterTitle = "Statistics",
    statisticsParameterDesc = "Include task in statistics",
    saveTaskButtonTitle = "Save",
    cancelButtonTitle = "Cancel",
    templateIconDesc = "Add to Templates",
    topAppBarDeleteTitle = "Delete",
    categoryValidateError = "* Select a category",
    otherError = "Error! Contact the developer.",
    startOverlayError = "Conflict! Task start overlay.",
    endOverlayError = "Conflict! Task end overlay.",
    fullOverlayError = "Conflict! Overlapping tasks.",
    correctOverlayTitle = "Fix",
    durationPickerTitle = "Duration",
    templatesSheetTitle = "Templates",
    controlTitle = "Manage",
    applyTitle = "Apply",
    timeRangeFormat = "Time: from %S to %s",
    durationFormat = "Duration: %s",
    notificationEnabledTitle = "Notification: enabled",
    notificationDisabledTitle = "Notification: disabled",
    emptyTemplatesTitle = "List is empty",
    saveTemplateWarningTitle = "Do you want to apply the changes to the current template?",
    saveTemplateWarningConfirm = "Yes",
    saveTemplateWarningUnsave = "No",
    categoriesManageWarningTitle = "Are you sure you want to go to the category management screen? " +
        "The current parameters will remain unsaved",
    confirmNavigateTitle = "Go",
    importantParameterTitle = "Special priority",
    importantParameterDesc = "Mandatory execution without the possibility of shifting",
    noteLabel = "Note",
    notePlaceholder = "A small note is optional",
)

internal val persianHomeString = EditorStrings(
    topAppBarEditorTitle = "ویرایشگر",
    topAppBarBackIconDesc = "بازگشت",
    topAppBarMoreIconDesc = "بیشتر",
    topAppBarTemplatesTitle = "قالب ها",
    mainCategoryChooserTitle = "دسته بندی",
    mainCategoryChooserExpandedIconDesc = "انتخاب دسته بندی",
    subCategoryChooserTitle = "زیرمجموعه",
    categoryNotSelectedTitle = "خالی",
    subCategoryDialogAddedTitle = "افزودن",
    subCategoryDialogMainCategoryFormat = "دسته بندی: %s",
    timeFieldStartLabel = "شرووع",
    timeFieldEndLabel = "پایان",
    parameterChooserSwitchIconDesc = "تنظیم پارامتر",
    timePickerHeader = "وارد کردن زمان",
    timePickerSeparator = ":",
    notifyParameterTitle = "اعلان ها",
    notifyParameterDesc = "هنگام تکمیل این کار، یک اعلان ارسال شود",
    statisticsParameterTitle = "آمارها",
    statisticsParameterDesc = "Include task in statistics",
    saveTaskButtonTitle = "دخیره",
    cancelButtonTitle = "لغو",
    templateIconDesc = "افزودن به قالب ها",
    topAppBarDeleteTitle = "حذف",
    categoryValidateError = "* انتخاب دسته بندی",
    otherError = "خطا! با توسعه دهنده تماس بگیرید.",
    startOverlayError = "تداخل! همپوشانی کردن شروع وظیفه",
    endOverlayError = "تداخل! همپوشانی کردن پایان وظیفه",
    fullOverlayError = "تداخل! وظایف همپوشانی دارند.",
    correctOverlayTitle = "تصحیح",
    durationPickerTitle = "مدت زمان",
    templatesSheetTitle = "قالب ها",
    controlTitle = "مدیریت",
    applyTitle = "اعمال",
    timeRangeFormat = "زمان: از %S تا %s",
    durationFormat = "مدت زمان: %s",
    notificationEnabledTitle = "اعلان: فعال",
    notificationDisabledTitle = "اعلان: غیرغعال",
    emptyTemplatesTitle = "لیست خالی است",
    saveTemplateWarningTitle = "آیا می خواهید تغییرات را در قالب فعلی اعمال کنید؟?",
    saveTemplateWarningConfirm = "بله",
    saveTemplateWarningUnsave = "خیر",
    categoriesManageWarningTitle = "آیا مطمئن هستید که می خواهید به صفحه مدیریت دسته بندی بروید؟ " +
        "پارامترهای فعلی ذخیره نشده باقی خواهند ماند",
    confirmNavigateTitle = "برو",
    importantParameterTitle = "اولویت ویژه",
    importantParameterDesc = "اجرای اجباری بدون امکان جابجایی",
    noteLabel = "یادداشت",
    notePlaceholder = "یک یادداشت کوچک اختیاری است",
)

internal val germanHomeString = EditorStrings(
    topAppBarEditorTitle = "Redakteur",
    topAppBarBackIconDesc = "Zurück",
    topAppBarMoreIconDesc = "Zusätzlich",
    topAppBarTemplatesTitle = "Muster",
    mainCategoryChooserTitle = "Kategorie",
    subCategoryChooserTitle = "Unterkategorie",
    mainCategoryChooserExpandedIconDesc = "Kategorie auswählen",
    categoryNotSelectedTitle = "Fehlt",
    subCategoryDialogAddedTitle = "Hinzufügen",
    subCategoryDialogMainCategoryFormat = "Kategorie: %s",
    timeFieldStartLabel = "Start",
    timeFieldEndLabel = "Das Ende",
    parameterChooserSwitchIconDesc = "Parameter festlegen",
    timePickerHeader = "Zeit wählen",
    timePickerSeparator = ":",
    notifyParameterTitle = "Benachrichtigungen",
    notifyParameterDesc = "Benachrichtigung senden, wenn eine Aufgabe ausgeführt wird",
    statisticsParameterTitle = "Statistik",
    statisticsParameterDesc = "Daten in Statistiken berücksichtigen",
    saveTaskButtonTitle = "Speichern",
    cancelButtonTitle = "Abschaffen",
    templateIconDesc = "Zu Vorlagen hinzufügen",
    topAppBarDeleteTitle = "Entfernen",
    categoryValidateError = "* Wählen Sie eine Kategorie aus",
    otherError = "Fehler! Wenden Sie sich an den Entwickler.",
    startOverlayError = "Konflikt! Überlagerung des Aufgabenstarts.",
    endOverlayError = "Konflikt! Überlagert das Ende der Aufgabe.",
    fullOverlayError = "Konflikt! Überlagerung von Aufgaben.",
    correctOverlayTitle = "Korrigieren",
    durationPickerTitle = "Dauer",
    templatesSheetTitle = "Muster",
    controlTitle = "Verwalten",
    applyTitle = "Anwenden",
    timeRangeFormat = "Zeit von %s bis %s Uhr",
    durationFormat = "Dauer: %s",
    notificationEnabledTitle = "Benachrichtigungen: eingeschaltet",
    notificationDisabledTitle = "Benachrichtigungen: sind deaktiviert",
    emptyTemplatesTitle = "Die Liste ist leer",
    saveTemplateWarningTitle = "Möchten Sie die Änderungen auf die aktuelle Vorlage anwenden?",
    saveTemplateWarningConfirm = "Ja",
    saveTemplateWarningUnsave = "Nein",
    categoriesManageWarningTitle = "Sind Sie sicher, dass Sie den Kategoriemanagementbildschirm aufrufen möchten?",
    confirmNavigateTitle = "Übergehen",
    importantParameterTitle = "Besondere Priorität",
    importantParameterDesc = "Zwingende Ausführung ohne Verschiebungsmöglichkeit",
    noteLabel = "Notiz",
    notePlaceholder = "Eine kleine Anmerkung optional",
)

internal val spanishHomeString = EditorStrings(
    topAppBarEditorTitle = "Editor",
    topAppBarBackIconDesc = "Volver",
    topAppBarMoreIconDesc = "Más",
    topAppBarTemplatesTitle = "Plantillas",
    mainCategoryChooserTitle = "Categoría",
    mainCategoryChooserExpandedIconDesc = "Selecciona categoría",
    subCategoryChooserTitle = "Subcategoría",
    categoryNotSelectedTitle = "Ninguna",
    subCategoryDialogAddedTitle = "Añadir",
    subCategoryDialogMainCategoryFormat = "Categoría: %s",
    timeFieldStartLabel = "Empieza",
    timeFieldEndLabel = "Termina",
    parameterChooserSwitchIconDesc = "Establecer parámetro",
    timePickerHeader = "Introduce la hora",
    timePickerSeparator = ":",
    notifyParameterTitle = "Notificaciones",
    notifyParameterDesc = "Envía una notificación al completar la tarea",
    statisticsParameterTitle = "Estadísticas",
    statisticsParameterDesc = "Incluye la tarea en las estadísticas",
    saveTaskButtonTitle = "Guardar",
    cancelButtonTitle = "Cancelar",
    templateIconDesc = "Añadir a Plantillas",
    topAppBarDeleteTitle = "Eliminar",
    categoryValidateError = "* Selecciona una categoría",
    otherError = "¡Error! Contacta al desarrollador.",
    startOverlayError = "¡Conflicto! Inicio superpuesto.",
    endOverlayError = "¡Conflicto! Fin superpuesto.",
    fullOverlayError = "¡Conflicto! Tareas superpuestas.",
    correctOverlayTitle = "Corrige",
    durationPickerTitle = "Duración",
    templatesSheetTitle = "Plantillas",
    controlTitle = "Gestionar",
    applyTitle = "Aplicar",
    timeRangeFormat = "Hora: de %S a %s",
    durationFormat = "Duración: %s",
    notificationEnabledTitle = "Notificación: activada",
    notificationDisabledTitle = "Notificación: desactivada",
    emptyTemplatesTitle = "Lista vacía",
    saveTemplateWarningTitle = "¿Quieres aplicar los cambios a la plantilla actual?",
    saveTemplateWarningConfirm = "Sí",
    saveTemplateWarningUnsave = "No",
    categoriesManageWarningTitle = "¿Quieres ir a la gestión de categorías? " +
        "Los parámetros actuales no se guardarán",
    confirmNavigateTitle = "Ir",
    importantParameterTitle = "Prioridad especial",
    importantParameterDesc = "Realización obligatoria sin posibilidad de desplazamiento",
    noteLabel = "Nota",
    notePlaceholder = "Una pequeña nota opcional",
)

internal val frenchHomeString = EditorStrings(
    topAppBarEditorTitle = "Éditeur",
    topAppBarBackIconDesc = "Retour",
    topAppBarMoreIconDesc = "Plus",
    topAppBarTemplatesTitle = "Modèles",
    mainCategoryChooserTitle = "Catégorie",
    mainCategoryChooserExpandedIconDesc = "Sélectionner la catégorie",
    subCategoryChooserTitle = "Sous-catégorie",
    categoryNotSelectedTitle = "Absent",
    subCategoryDialogAddedTitle = "Ajouter",
    subCategoryDialogMainCategoryFormat = "Catégorie: %s",
    timeFieldStartLabel = "Début",
    timeFieldEndLabel = "Fin",
    parameterChooserSwitchIconDesc = "Set parameter",
    timePickerHeader = "Entre l'heure",
    timePickerSeparator = ":",
    notifyParameterTitle = "Notifications",
    notifyParameterDesc = "Envoyer une notification lorsque la tâche est terminée",
    statisticsParameterTitle = "Statistiques",
    statisticsParameterDesc = "Inclure cette tâche dans les statistiques",
    saveTaskButtonTitle = "Sauvegarder",
    cancelButtonTitle = "Annuler",
    templateIconDesc = "Ajouter aux modèles",
    topAppBarDeleteTitle = "Supprimer",
    categoryValidateError = "* Sélectionnez une catégorie!",
    otherError = "Erreur! Veuillez contater le developpeur.",
    startOverlayError = "Conflit! Le début de la tâche se superpose.",
    endOverlayError = "Conflict! La fin de la tâche se superpose.",
    fullOverlayError = "Conflict! Deux tâches se chevanchent.",
    correctOverlayTitle = "Corriger",
    durationPickerTitle = "Durée",
    templatesSheetTitle = "Modèles",
    controlTitle = "Gestion",
    applyTitle = "Appliquer",
    timeRangeFormat = "Temps: de %S à %s",
    durationFormat = "Durée: %s",
    notificationEnabledTitle = "Notification: activées",
    notificationDisabledTitle = "Notification: désactivées",
    emptyTemplatesTitle = "La liste est vide",
    saveTemplateWarningTitle = "Voulez-vous appliquer ces changement au modèle actuel ?",
    saveTemplateWarningConfirm = "Oui",
    saveTemplateWarningUnsave = "Non",
    categoriesManageWarningTitle = "Êtes-vous sur(e) de vouloir retourner à la gestion des catégories? " +
        "Les paramètres actuels ne seront pas sauvegardés.",
    confirmNavigateTitle = "Aller",
    importantParameterTitle = "Priorité spéciale",
    importantParameterDesc = "Exécution prioriaire sans la possibilité de la décaler",
    noteLabel = "Note",
    notePlaceholder = "Petite Note en option",
)

internal val brazilianPortugueseHomeString = EditorStrings(
    topAppBarEditorTitle = "Editor",
    topAppBarBackIconDesc = "Voltar",
    topAppBarMoreIconDesc = "Mais",
    topAppBarTemplatesTitle = "Templates",
    mainCategoryChooserTitle = "Categorias",
    mainCategoryChooserExpandedIconDesc = "Selecione uma categoria",
    subCategoryChooserTitle = "Subcategoria",
    categoryNotSelectedTitle = "Nenhum",
    subCategoryDialogAddedTitle = "Adicionar",
    subCategoryDialogMainCategoryFormat = "Categoria: %s",
    timeFieldStartLabel = "Iniciar",
    timeFieldEndLabel = "Terminar",
    parameterChooserSwitchIconDesc = "Definir parâmetro",
    timePickerHeader = "Adicione o tempo",
    timePickerSeparator = ":",
    notifyParameterTitle = "Notificação",
    notifyParameterDesc = "Enviar uma notificação quando terminar essa tarefa",
    statisticsParameterTitle = "Estatísticas",
    statisticsParameterDesc = "Incluir tarefa nas estatísticas",
    saveTaskButtonTitle = "Salvar",
    cancelButtonTitle = "Cancelar",
    templateIconDesc = "Adicionar aos Templates",
    topAppBarDeleteTitle = "Deletar",
    categoryValidateError = "* Selecionar uma categoria",
    otherError = "Erro! Contate o desenvolvedor.",
    startOverlayError = "Conflito! Início da tarefa em sobreposição.",
    endOverlayError = "Conflito! Fim da tarefa em sobreposição.",
    fullOverlayError = "Conflito! Tarefas sobrepostas.",
    correctOverlayTitle = "Consertar",
    durationPickerTitle = "Duração",
    templatesSheetTitle = "Templates",
    controlTitle = "Administrar",
    applyTitle = "Aplicar",
    timeRangeFormat = "Tempo: from %S to %s",
    durationFormat = "Duração: %s",
    notificationEnabledTitle = "Notificação: ativada",
    notificationDisabledTitle = "Notificação: desativada",
    emptyTemplatesTitle = "Lista está vazia",
    saveTemplateWarningTitle = "Você deseja aplicar as mudanças ao template atual?",
    saveTemplateWarningConfirm = "Sim",
    saveTemplateWarningUnsave = "Não",
    categoriesManageWarningTitle = "Você tem certeza que deseja ir para a tela de administrar as categorias? " +
        "Os parâmetros atuais continuarão sem ser salvos.",
    confirmNavigateTitle = "Ir",
    importantParameterTitle = "Prioridade especial",
    importantParameterDesc = "Execução obrigatória, sem possibilidade de pular",
    noteLabel = "Nota",
    notePlaceholder = "Uma nota é opcional",
)

internal val LocalEditorStrings = staticCompositionLocalOf<EditorStrings> {
    error("Home Strings is not provided")
}

internal fun fetchEditorStrings(language: TimePlannerLanguage) = when (language) {
    TimePlannerLanguage.EN -> englishHomeString
    TimePlannerLanguage.RU -> russianHomeString
    TimePlannerLanguage.DE -> germanHomeString
    TimePlannerLanguage.ES -> spanishHomeString
    TimePlannerLanguage.FA -> persianHomeString
    TimePlannerLanguage.FR -> frenchHomeString
    TimePlannerLanguage.PT -> brazilianPortugueseHomeString
}
