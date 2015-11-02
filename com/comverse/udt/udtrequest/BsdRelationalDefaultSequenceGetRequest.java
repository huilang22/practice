/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalDefaultSequenceGetRequest.java
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
 * Class used to create a BsdRelationalDefaultSequenceGetRequest Udt Request
 *
 */

public class BsdRelationalDefaultSequenceGetRequest extends BsdRelationalDefaultSubRequestParent {
/**
 *
 * Constructor to create a  BsdRelationalDefaultSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdRelationalDefaultSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdRelationalDefaultSequenceGet");
  }

/**
 *
 * Retrieves the BsdRelationalDefaultObjectBaseKeyData that results from the BsdRelationalDefaultSequenceGetRequest call
 * @return BsdRelationalDefaultObjectBaseKeyData resulting from udt call
 *
 */

  public BsdRelationalDefaultObjectBaseKeyData getOutput() {
    return BsdRelationalDefaultObjectBaseKeyHelper.fromMap(outputMap, "BsdRelationalDefault");
  }
}
