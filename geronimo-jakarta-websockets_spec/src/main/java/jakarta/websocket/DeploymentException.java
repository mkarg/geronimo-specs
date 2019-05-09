/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package jakarta.websocket;

/**
 * Checked exception indicating some kind of failure either to publish an endpoint on its server, or a failure to
 * connect a client to its server.
 */
public class DeploymentException extends Exception {
    private static final long serialVersionUID = -1927418844498491675L;

    /**
     * Creates a deployment exception with the given reason for the deployment failure.
     * 
     * @param message
     *            the reason for the failure.
     */
    public DeploymentException(String message) {
        super(message);
    }

    /**
     * Creates a deployment exception with the given reason for the deployment failure and wrapped cause of the failure.
     * 
     * @param message
     *            the reason for the failure.
     * @param cause
     *            the cause of the problem.
     */
    public DeploymentException(String message, Throwable cause) {
        super(message, cause);
    }

}