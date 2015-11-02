/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataParamTypeFindBulkUdtTemplateItem.java
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
