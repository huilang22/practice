/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LogFileFindRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.utl.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a LogFileFindRequest Udt Request
 *
 */

public class LogFileFindRequest extends LogRequest {
/**
 *
 * Constructor to create a  LogFileFindRequest
 * @param id Unique request name
 * @param __log LogfileObjectKeyData for LogFileFindRequest
 *
 */
@JsonCreator
  public LogFileFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Log")LogfileObjectKeyData __log) {
    super(id, "LogFileFind");
    if (__log != null) {
      addInput("Log", LogfileObjectKeyHelper.toMap(__log, new HashMap(), "LogfileObjectKeyData").get("LogfileObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the String[] that results from the LogFileFindRequest call
 * @return String[] resulting from udt call
 *
 */

  public String[] getOutput() {
    return  (String[])outputMap.get("Line");
  }
}
