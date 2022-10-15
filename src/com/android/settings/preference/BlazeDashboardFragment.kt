/*
 * Copyright (C) 2022 The PixelDust Project
 * SPDX-License-Identifier: Apache-2.0
 */

package com.android.settings.preference

import androidx.preference.Preference

import com.android.internal.logging.nano.MetricsProto
import com.android.settings.dashboard.DashboardFragment

abstract class BlazeDashboardFragment: DashboardFragment() {
    override fun getMetricsCategory(): Int = MetricsProto.MetricsEvent.BLAZE_HOUSE

    override fun onDisplayPreferenceDialog(preference: Preference) {
        super.onDisplayPreferenceDialog(preference)
    }

    companion object {
        const val REQUEST_KEY = "BlazeDashboardFragment#RequestKey"
    }
}
