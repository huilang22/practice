/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrFindRequest.java
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
 * Class used to create a CsrFindRequest Udt Request
 *
 */

public class CsrFindRequest extends CsrRequest {
/**
 *
 * Constructor to create a  CsrFindRequest
 * @param id Unique request name
 * @param CSRfindIn CsrObjectFilter for CsrFindRequest
 *
 */
@JsonCreator
  public CsrFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Csr")CsrObjectFilter CSRfindIn) {
    super(id, "CsrFind");
    if (CSRfindIn != null) {
      Integer index =  CSRfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Csr", CsrObjectHelper.toMap(CSRfindIn, new HashMap(), "Csr").get("Csr"));
    }
  }

/**
 *
 * Retrieves the CsrObjectDataList that results from the CsrFindRequest call
 * @return CsrObjectDataList resulting from udt call
 *
 */

  public CsrObjectDataList getOutput() {
    return CsrObjectHelper.fromMapList(outputMap, "CsrList");
  }
}
