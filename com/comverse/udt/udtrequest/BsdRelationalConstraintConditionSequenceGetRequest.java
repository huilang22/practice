/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintConditionSequenceGetRequest.java
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
 * Class used to create a BsdRelationalConstraintConditionSequenceGetRequest Udt Request
 *
 */

public class BsdRelationalConstraintConditionSequenceGetRequest extends BsdRelationalConstraintConditionSubRequestParent {
/**
 *
 * Constructor to create a  BsdRelationalConstraintConditionSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdRelationalConstraintConditionSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdRelationalConstraintConditionSequenceGet");
  }

/**
 *
 * Retrieves the BsdRelationalConstraintConditionObjectKeyData that results from the BsdRelationalConstraintConditionSequenceGetRequest call
 * @return BsdRelationalConstraintConditionObjectKeyData resulting from udt call
 *
 */

  public BsdRelationalConstraintConditionObjectKeyData getOutput() {
    return BsdRelationalConstraintConditionObjectKeyHelper.fromMap(outputMap, "BsdRelationalConstraintCondition");
  }
}
