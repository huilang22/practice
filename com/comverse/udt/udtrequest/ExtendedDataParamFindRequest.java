/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataParamFindRequest.java
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
 * Class used to create a ExtendedDataParamFindRequest Udt Request
 *
 */

public class ExtendedDataParamFindRequest extends ExtendedDataParamRequest {
/**
 *
 * Constructor to create a  ExtendedDataParamFindRequest
 * @param id Unique request name
 * @param PDFindIn XPDObjectFilter for ExtendedDataParamFindRequest
 *
 */
@JsonCreator
  public ExtendedDataParamFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExtendedDataParam")XPDObjectFilter PDFindIn) {
    super(id, "ExtendedDataParamFind");
    if (PDFindIn != null) {
      Integer index =  PDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExtendedDataParam", XPDObjectHelper.toMap(PDFindIn, new HashMap(), "ExtendedDataParam").get("ExtendedDataParam"));
    }
  }

/**
 *
 * Retrieves the XPDObjectDataList that results from the ExtendedDataParamFindRequest call
 * @return XPDObjectDataList resulting from udt call
 *
 */

  public XPDObjectDataList getOutput() {
    return XPDObjectHelper.fromMapList(outputMap, "ExtendedDataParamList");
  }
}
