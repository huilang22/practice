/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvAutoActionDelRequest.java
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
 * Class used to create a InvAutoActionDelRequest Udt Request
 *
 */

public class InvAutoActionDelRequest extends InvAutoActionRequest {
/**
 *
 * Constructor to create a  InvAutoActionDelRequest
 * @param id Unique request name
 * @param InvAutoActionDelIn InvAutoActionObjFilter for InvAutoActionDelRequest
 *
 */
@JsonCreator
  public InvAutoActionDelRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvAutoAction")InvAutoActionObjFilter InvAutoActionDelIn) {
    super(id, "InvAutoActionDel");
    if (InvAutoActionDelIn != null) {
      Integer index =  InvAutoActionDelIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvAutoAction", InvAutoActionObjHelper.toMap(InvAutoActionDelIn, new HashMap(), "Void").get("Void"));
    }
  }

}
