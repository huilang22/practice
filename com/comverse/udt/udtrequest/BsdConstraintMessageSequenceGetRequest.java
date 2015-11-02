/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintMessageSequenceGetRequest.java
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
 * Class used to create a BsdConstraintMessageSequenceGetRequest Udt Request
 *
 */

public class BsdConstraintMessageSequenceGetRequest extends BsdConstraintMessageSubRequestParent {
/**
 *
 * Constructor to create a  BsdConstraintMessageSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdConstraintMessageSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdConstraintMessageSequenceGet");
  }

/**
 *
 * Retrieves the BsdConstraintMessageObjectBaseKeyData that results from the BsdConstraintMessageSequenceGetRequest call
 * @return BsdConstraintMessageObjectBaseKeyData resulting from udt call
 *
 */

  public BsdConstraintMessageObjectBaseKeyData getOutput() {
    return BsdConstraintMessageObjectBaseKeyHelper.fromMap(outputMap, "BsdConstraintMessage");
  }
}
