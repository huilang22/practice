/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailAssocDeleteRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsLocationDetailAssocDeleteRequest Udt Request
 *
 */

public class InvsLocationDetailAssocDeleteRequest extends InvsLocationDetailAssocRequest {
/**
 *
 * Constructor to create a  InvsLocationDetailAssocDeleteRequest
 * @param id Unique request name
 * @param InvsLocationDetailAssocDeleteIn InvsLocationDetailAssocObjectData for InvsLocationDetailAssocDeleteRequest
 *
 */
@JsonCreator
  public InvsLocationDetailAssocDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocationDetailAssoc")InvsLocationDetailAssocObjectData InvsLocationDetailAssocDeleteIn) {
    super(id, "InvsLocationDetailAssocDelete");
    if (InvsLocationDetailAssocDeleteIn != null) {
      addInput("InvsLocationDetailAssoc", InvsLocationDetailAssocObjectHelper.toMap(InvsLocationDetailAssocDeleteIn, new HashMap(), "Void").get("Void"));
    }
  }

}
