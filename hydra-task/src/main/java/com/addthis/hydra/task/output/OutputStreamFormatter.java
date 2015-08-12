/*
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
package com.addthis.hydra.task.output;

import com.addthis.codec.annotations.Pluggable;

/**
 * This section of the job specification handles formatting of output sinks.
 * <p/>
 * <p>Formatters are responsible for the representation of output.</p>
 *
 * @user-reference
 * @hydra-category Output Stream Formatters
 * @hydra-doc-position 10
 */
@Pluggable("output stream formatter")
public abstract class OutputStreamFormatter {

    public abstract OutputStreamEmitter createEmitter();

    public abstract void open();
}
