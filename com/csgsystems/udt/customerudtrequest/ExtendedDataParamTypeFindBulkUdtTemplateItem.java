/*
 * Generated code DO NOT EDIT
 * Generated file: ExtendedDataParamTypeFindBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a ExtendedDataParamTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ExtendedDataParamTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected XPTObjectFilter PDFindIn;
/**
 *
 * Constructor to create a  ExtendedDataParamTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExtendedDataParamTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, XPTObjectFilter PDFindInIn) {
    super(id, context, "ExtendedDataParamTypeFind");
    PDFindIn = PDFindInIn;
  }

  public void translateToMap() {
    if (PDFindIn != null) {
      Integer index =  PDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExtendedDataParamType", XPTObjectHelper.toMap(PDFindIn, new HashMap(), "ExtendedDataParamType").get("ExtendedDataParamType"));
    }
  }


/**
 *
 * Sets the ExtendedDataParamType
 * @param PDFindInIn Value of the PDFindIn
 *
 */

  public void setExtendedDataParamType(XPTObjectFilter PDFindInIn) {
    PDFindIn = PDFindInIn;
  }

  public void translateFromMap() {
    PDFindIn = XPTObjectHelper.fromMapFilter(inputMap, "ExtendedDataParamType");
  }

/**
 *
 * Gets the ExtendedDataParamType
 * @return Value of the ExtendedDataParamType
 *
 */

  public XPTObjectFilter getExtendedDataParamType( ) {
    return PDFindIn;
  }

}
