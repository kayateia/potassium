/*
 * Copyright 2019 New Vector Ltd
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

package im.vector.app.features.share

import android.os.Parcelable
import im.vector.matrix.android.api.session.content.ContentAttachmentData
import kotlinx.android.parcel.Parcelize

sealed class SharedData: Parcelable {

    @Parcelize
    data class Text(val text: String): SharedData()

    @Parcelize
    data class Attachments(val attachmentData: List<ContentAttachmentData>): SharedData()
}
