/*
 *  Copyright (c) 2005-2013, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

package org.wso2.carbon.runtime.spi;

import org.wso2.carbon.runtime.RuntimeState;

/**
 * This interface is used to plug custom runtime into carbon, by extending this interface you
 * can integrate your Runtime instance on carbon server
 *
 * A developer who wants to integrate a custom runtime should implement this.
 */

public interface Runtime {

    /**
     * Initialize the Runtime
     *
     * This will contain all the code that need to be called when the runtime initialization
     */
    void init();

    /**
     * Start the Runtime
     *
     * This will contain all the code that need to be called during runtime start
     */
    void start();

    /**
     * Stop the Runtime
     *
     * This will contain all the code that need to be called when runtime need to be stopped
     */
    void stop();

    /**
     * Put the Runtime into maintenance mode
     *
     * This will contain all the code that need to be called when runtime starting its MAINTENANCE state
     */
    void startMaintenance();

    /**
     * Put the Runtime into INACTIVE state form MAINTENANCE state
     *
     * This will contain all the code that need to be called when runtime stops its maintenance mode
     */
    void stopMaintenance();

    /**
     * Return the current state of the runtime
     * @return RuntimeState - current state
     */
    Enum<RuntimeState> getState();

    /**
     * Set current state of a runtime
     * @param runtimeState - new state
     */
    void setState(RuntimeState runtimeState);

}
