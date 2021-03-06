package kontinuum.model.config

data class StageConfig(val name:String, val needsEmulator: Boolean = false)
data class RepoConfig(val type: String, val stages: List<StageConfig>)