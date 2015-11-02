/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintDescriptionSequenceGetRequest.java
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
 * Class used to create a BsdConstraintDescriptionSequenceGetRequest Udt Request
 *
 */

public class BsdConstraintDescriptionSequenceGetRequest extends BsdConstraintDescriptionSubRequestParent {
/**
 *
 * Constructor to create a  BsdConstraintDescriptionSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdConstraintDescriptionSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdConstraintDescriptionSequenceGet");
  }

/**
 *
 * Retrieves the BsdConstraintDescriptionObjectKeyData that results from the BsdConstraintDescriptionSequenceGetRequest call
 * @return BsdConstraintDescriptionObjectKeyData resulting from udt call
 *
 */

  public BsdConstraintDescriptionObjectKeyData getOutput() {
    return BsdConstraintDescriptionObjectKeyHelper.fromMap(outputMap, "BsdConstraintDescription");
  }
}
