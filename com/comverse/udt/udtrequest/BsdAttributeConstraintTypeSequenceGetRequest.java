/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeConstraintTypeSequenceGetRequest.java
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
 * Class used to create a BsdAttributeConstraintTypeSequenceGetRequest Udt Request
 *
 */

public class BsdAttributeConstraintTypeSequenceGetRequest extends BsdAttributeConstraintTypeSubRequestParent {
/**
 *
 * Constructor to create a  BsdAttributeConstraintTypeSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdAttributeConstraintTypeSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdAttributeConstraintTypeSequenceGet");
  }

/**
 *
 * Retrieves the BsdAttributeConstraintTypeObjectKeyData that results from the BsdAttributeConstraintTypeSequenceGetRequest call
 * @return BsdAttributeConstraintTypeObjectKeyData resulting from udt call
 *
 */

  public BsdAttributeConstraintTypeObjectKeyData getOutput() {
    return BsdAttributeConstraintTypeObjectKeyHelper.fromMap(outputMap, "BsdAttributeConstraintType");
  }
}
