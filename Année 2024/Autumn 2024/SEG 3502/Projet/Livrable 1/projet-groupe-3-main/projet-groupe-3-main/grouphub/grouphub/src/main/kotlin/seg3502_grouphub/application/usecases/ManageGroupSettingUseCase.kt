package seg3502_grouphub.application.usecases

interface ManageGroupSettingUseCase {
    fun updateGroupSettings(groupId: String, settings: GroupSettings): Boolean
}