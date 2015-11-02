/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintSequenceGetRequest.java
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
 * Class used to create a BsdAttributeConstraintSequenceGetRequest Udt Request
 *
 */

public class BsdAttributeConstraintSequenceGetRequest extends BsdAttributeConstraintSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeConstraintSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdAttributeConstraintSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdAttributeConstraintSequenceGet");
  }

/**
 *
 * Retrieves the BsdAttributeConstraintObjectBaseKeyData that results from the BsdAttributeConstraintSequenceGetRequest call
 * @return BsdAttributeConstraintObjectBaseKeyData resulting from udt call
 *
 */

  public BsdAttributeConstraintObjectBaseKeyData getOutput() {
    return BsdAttributeConstraintObjectBaseKeyHelper.fromMap(outputMap, "BsdAttributeConstraint");
  }
}
