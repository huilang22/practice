/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintSequenceGetRequest.java
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
 * Class used to create a BsdRelationalConstraintSequenceGetRequest Udt Request
 *
 */

public class BsdRelationalConstraintSequenceGetRequest extends BsdRelationalConstraintSubRequestParent {
/**
 *
 * Constructor to create a  BsdRelationalConstraintSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdRelationalConstraintSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdRelationalConstraintSequenceGet");
  }

/**
 *
 * Retrieves the BsdRelationalConstraintObjectBaseKeyData that results from the BsdRelationalConstraintSequenceGetRequest call
 * @return BsdRelationalConstraintObjectBaseKeyData resulting from udt call
 *
 */

  public BsdRelationalConstraintObjectBaseKeyData getOutput() {
    return BsdRelationalConstraintObjectBaseKeyHelper.fromMap(outputMap, "BsdRelationalConstraint");
  }
}
