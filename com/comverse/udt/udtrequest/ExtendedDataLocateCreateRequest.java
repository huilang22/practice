/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataLocateCreateRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ExtendedDataLocateCreateRequest Udt Request
 *
 */

public class ExtendedDataLocateCreateRequest extends ExtendedDataLocateRequest {
/**
 *
 * Constructor to create a  ExtendedDataLocateCreateRequest
 * @param id Unique request name
 * @param elcIn ExtendedDataLocateObjectData for ExtendedDataLocateCreateRequest
 *
 */
@JsonCreator
  public ExtendedDataLocateCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExtendedDataLocate")ExtendedDataLocateObjectData elcIn) {
    super(id, "ExtendedDataLocateCreate");
    if (elcIn != null) {
      addInput("ExtendedDataLocate", ExtendedDataLocateObjectHelper.toMap(elcIn, new HashMap(), "Void").get("Void"));
    }
  }

}
