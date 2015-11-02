/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGroupFunctionFindRequest.java
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
 * Class used to create a CsrGroupFunctionFindRequest Udt Request
 *
 */

public class CsrGroupFunctionFindRequest extends CsrGroupFunctionRequest {
/**
 *
 * Constructor to create a  CsrGroupFunctionFindRequest
 * @param id Unique request name
 * @param GFFindIn CsrGroupFunctionObjectFilter for CsrGroupFunctionFindRequest
 *
 */
@JsonCreator
  public CsrGroupFunctionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CsrGroupFunction")CsrGroupFunctionObjectFilter GFFindIn) {
    super(id, "CsrGroupFunctionFind");
    if (GFFindIn != null) {
      Integer index =  GFFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CsrGroupFunction", CsrGroupFunctionObjectHelper.toMap(GFFindIn, new HashMap(), "CsrGroupFunction").get("CsrGroupFunction"));
    }
  }

/**
 *
 * Retrieves the CsrGroupFunctionObjectDataList that results from the CsrGroupFunctionFindRequest call
 * @return CsrGroupFunctionObjectDataList resulting from udt call
 *
 */

  public CsrGroupFunctionObjectDataList getOutput() {
    return CsrGroupFunctionObjectHelper.fromMapList(outputMap, "CsrGroupFunctionList");
  }
}
