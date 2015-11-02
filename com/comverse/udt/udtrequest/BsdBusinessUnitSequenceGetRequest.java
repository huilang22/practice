/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdBusinessUnitSequenceGetRequest.java
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
 * Class used to create a BsdBusinessUnitSequenceGetRequest Udt Request
 *
 */

public class BsdBusinessUnitSequenceGetRequest extends BsdBusinessUnitSubRequestParent {
/**
 *
 * Constructor to create a  BsdBusinessUnitSequenceGetRequest
 * @param id Unique request name
 *
 */
@JsonCreator
  public BsdBusinessUnitSequenceGetRequest(@JsonProperty("RequestId") String id) {
    super(id, "BsdBusinessUnitSequenceGet");
  }

/**
 *
 * Retrieves the BsdBusinessUnitObjectKeyData that results from the BsdBusinessUnitSequenceGetRequest call
 * @return BsdBusinessUnitObjectKeyData resulting from udt call
 *
 */

  public BsdBusinessUnitObjectKeyData getOutput() {
    return BsdBusinessUnitObjectKeyHelper.fromMap(outputMap, "BsdBusinessUnit");
  }
}
