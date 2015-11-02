/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDefinitionCheckRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BusinessDayDefinitionCheckRequest Udt Request
 *
 */

public class BusinessDayDefinitionCheckRequest extends BusinessDayDefinitionRequest {
/**
 *
 * Constructor to create a  BusinessDayDefinitionCheckRequest
 * @param id Unique request name
 * @param BDDcheck_In Date for BusinessDayDefinitionCheckRequest
 *
 */
@JsonCreator
  public BusinessDayDefinitionCheckRequest(@JsonProperty("RequestId") String id, @JsonProperty("BDDcheckIn")Date BDDcheck_In) {
    super(id, "BusinessDayDefinitionCheck");
    if (BDDcheck_In != null) {
      addInput("BDDcheckIn", BDDcheck_In);
    }
  }

/**
 *
 * Retrieves the String that results from the BusinessDayDefinitionCheckRequest call
 * @return String resulting from udt call
 *
 */

  public String getOutput() {
    return  (String)outputMap.get("BDDcheckOut");
  }
}
