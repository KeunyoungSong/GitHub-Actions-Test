plugins {
	alias(libs.plugins.android.application) apply false
	alias(libs.plugins.jetbrains.kotlin.android) apply false
	id("io.gitlab.arturbosch.detekt").version("1.23.3")
}
