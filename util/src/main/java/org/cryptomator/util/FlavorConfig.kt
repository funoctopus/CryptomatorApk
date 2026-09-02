package org.cryptomator.util

object FlavorConfig {

    /** Premium flavors (Play Store and Accrescent editions) ship with full access, so license enforcement is bypassed. */
    val isPremiumFlavor: Boolean = true

    /** The freemium IAP (in-app purchase) flavor distributed on Google Play. */
    val isFreemiumFlavor: Boolean = false

    /** The APK Store edition (website direct download). Supports self-update checks. */
    val isApkStoreFlavor: Boolean = BuildConfig.FLAVOR == "apkstore"

    /** The lite (F-Droid main repo) edition. Excludes all API-key-based cloud providers. */
    val isLiteFlavor: Boolean = BuildConfig.FLAVOR == "lite"

    /** Flavors that exclude Google Drive (no Google Play Services available). */
    val excludesGoogleDrive: Boolean = BuildConfig.FLAVOR == "fdroid" || BuildConfig.FLAVOR == "accrescent"
}
