/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintConditionSequenceGetRequest.java
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
 * Class used to create a BsdAttributeConstraintConditionSequenceGetRequest Udt Request
 *
 */

public class BsdAttributeConstraintConditionSequenceGetRequest extends BsdAttributeConstraintConditionSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeConstraintConditionSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdAttributeConstraintConditionSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdAttributeConstraintConditionSequenceGet");
  }

/**
 *
 * Retrieves the BsdAttributeConstraintConditionObjectKeyData that results from the BsdAttributeConstraintConditionSequenceGetRequest call
 * @return BsdAttributeConstraintConditionObjectKeyData resulting from udt call
 *
 */

  public BsdAttributeConstraintConditionObjectKeyData getOutput() {
    return BsdAttributeConstraintConditionObjectKeyHelper.fromMap(outputMap, "BsdAttributeConstraintCondition");
  }
}
