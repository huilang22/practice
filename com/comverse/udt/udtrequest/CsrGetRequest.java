/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGetRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CsrGetRequest Udt Request
 *
 */

public class CsrGetRequest extends CsrSubRequestParent {
/**
 *
 * Constructor to create a  CsrGetRequest
 * @param id Unique request name
 * @param CSRgetIn CsrObjectKeyData for CsrGetRequest
 *
 */
@JsonCreator
  public CsrGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("Csr")CsrObjectKeyData CSRgetIn) {
    super(id, "CsrGet");
    if (CSRgetIn != null) {
      addInput("Csr", CsrObjectKeyHelper.toMap(CSRgetIn, new HashMap(), "CsrObjectKeyData").get("CsrObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CsrObjectData that results from the CsrGetRequest call
 * @return CsrObjectData resulting from udt call
 *
 */

  public CsrObjectData getOutput() {
    return CsrObjectHelper.fromMap(outputMap, "Csr");
  }
}
