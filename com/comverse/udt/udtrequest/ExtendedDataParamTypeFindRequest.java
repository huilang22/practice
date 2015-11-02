/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataParamTypeFindRequest.java
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
 * Class used to create a ExtendedDataParamTypeFindRequest Udt Request
 *
 */

public class ExtendedDataParamTypeFindRequest extends ExtendedDataParamTypeRequest {
/**
 *
 * Constructor to create a  ExtendedDataParamTypeFindRequest
 * @param id Unique request name
 * @param PDFindIn XPTObjectFilter for ExtendedDataParamTypeFindRequest
 *
 */
@JsonCreator
  public ExtendedDataParamTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ExtendedDataParamType")XPTObjectFilter PDFindIn) {
    super(id, "ExtendedDataParamTypeFind");
    if (PDFindIn != null) {
      Integer index =  PDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExtendedDataParamType", XPTObjectHelper.toMap(PDFindIn, new HashMap(), "ExtendedDataParamType").get("ExtendedDataParamType"));
    }
  }

/**
 *
 * Retrieves the XPTObjectDataList that results from the ExtendedDataParamTypeFindRequest call
 * @return XPTObjectDataList resulting from udt call
 *
 */

  public XPTObjectDataList getOutput() {
    return XPTObjectHelper.fromMapList(outputMap, "ExtendedDataParamTypeList");
  }
}
