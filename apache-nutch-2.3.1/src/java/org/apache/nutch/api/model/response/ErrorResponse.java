/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.apache.nutch.api.model.response;

import org.apache.commons.lang.exception.ExceptionUtils;

public class ErrorResponse {
  private String exception;
  private String message;
  private String stackTrace;

  public ErrorResponse(Throwable throwable) {
    if (throwable == null) {
      message = "Unknown error!";
      return;
    }
    exception = throwable.getClass().toString();
    message = ExceptionUtils.getMessage(throwable);
    stackTrace = ExceptionUtils.getFullStackTrace(throwable);
  }

  public String getException() {
    return exception;
  }

  public String getMessage() {
    return message;
  }

  public String getStackTrace() {
    return stackTrace;
  }
}
