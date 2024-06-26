/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.sling.caconfig.bndplugin;

import aQute.bnd.osgi.Jar;
import org.junit.Test;

import static org.apache.sling.caconfig.bndplugin.ConfigurationClassScannerPlugin.CONFIGURATION_CLASSES_HEADER;

public class GenerateHeaderTest extends AbstractConfigurationClassScannerPlugin {

    @Test
    public void testBuild() throws Exception {
        Jar jar = builder.build();

        assertHeader(
                jar,
                CONFIGURATION_CLASSES_HEADER,
                "dummy.example.pkg1.Config1",
                "dummy.example.pkg1.Config2",
                "dummy.example.pkg1.sub1.Config3");
    }
}
