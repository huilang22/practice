/*
 * Generated code DO NOT EDIT
 * Generated file: InvSimVectorCreateBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.iv.data.*;

/**
 *
 * Class used to create a InvSimVectorCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class InvSimVectorCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected InvSimVectorObjData InvCreateInData;
  protected Integer RequestSize;
/**
 *
 * Constructor to create a  InvSimVectorCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public InvSimVectorCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, InvSimVectorObjData InvCreateInDataIn, Integer RequestSizeIn) {
    super(id, context, "InvSimVectorCreate");
    InvCreateInData = InvCreateInDataIn;
    RequestSize = RequestSizeIn;
  }

  public void translateToMap() {
    if (InvCreateInData != null) {
      InvCreateInData.resetFlags(true, true);
      addInput("InvSimVector", InvSimVectorObjHelper.toMap(InvCreateInData, new HashMap(), "InvSimVectorCreateOutputData").get("InvSimVectorCreateOutputData"));
    }
    if (RequestSize != null) {
      addInput("RequestSize", RequestSize);
    }
  }


/**
 *
 * Sets the InvSimVector
 * @param InvCreateInDataIn Value of the InvCreateInData
 *
 */

  public void setInvSimVector(InvSimVectorObjData InvCreateInDataIn) {
    InvCreateInData = InvCreateInDataIn;
  }

/**
 *
 * Sets the RequestSize
 * @param RequestSizeIn Value of the RequestSize
 *
 */

  public void setRequestSize(Integer RequestSizeIn) {
    RequestSize = RequestSizeIn;
  }

  public void translateFromMap() {
    InvCreateInData = InvSimVectorObjHelper.fromMap(inputMap, "InvSimVector");
    RequestSize = (Integer)inputMap.get("RequestSize");
  }

/**
 *
 * Gets the InvSimVector
 * @return Value of the InvSimVector
 *
 */

  public InvSimVectorObjData getInvSimVector( ) {
    return InvCreateInData;
  }

/**
 *
 * Gets the RequestSize
 * @return Value of the RequestSize
 *
 */

  public Integer getRequestSize( ) {
    return RequestSize;
  }

}
