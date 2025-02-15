package com.machiav3lli.fdroid.ui.compose.utils

import android.net.Uri
import com.machiav3lli.fdroid.database.entity.Release
import com.machiav3lli.fdroid.entity.ActionState

interface Callbacks {
    fun onActionClick(action: ActionState?)
    fun onPermissionsClick(group: String?, permissions: List<String>)
    fun onReleaseClick(release: Release)
    fun onUriClick(uri: Uri, shouldConfirm: Boolean): Boolean
}