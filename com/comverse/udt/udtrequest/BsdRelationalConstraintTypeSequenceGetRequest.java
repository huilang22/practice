/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalConstraintTypeSequenceGetRequest.java
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
 * Class used to create a BsdRelationalConstraintTypeSequenceGetRequest Udt Request
 *
 */

public class BsdRelationalConstraintTypeSequenceGetRequest extends BsdRelationalConstraintTypeSubRequestParent {
/**
 *
 * Constructor to create a  BsdRelationalConstraintTypeSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdRelationalConstraintTypeSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdRelationalConstraintTypeSequenceGet");
  }

/**
 *
 * Retrieves the BsdRelationalConstraintTypeObjectKeyData that results from the BsdRelationalConstraintTypeSequenceGetRequest call
 * @return BsdRelationalConstraintTypeObjectKeyData resulting from udt call
 *
 */

  public BsdRelationalConstraintTypeObjectKeyData getOutput() {
    return BsdRelationalConstraintTypeObjectKeyHelper.fromMap(outputMap, "BsdRelationalConstraintType");
  }
}
