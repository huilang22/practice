/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataParamFindBulkUdtTemplateItem.java
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
 * Class used to create a ExtendedDataParamFindBulkUdtTemplateItem Bulk Template
 *
 */

public class ExtendedDataParamFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected XPDObjectFilter PDFindIn;
/**
 *
 * Constructor to create a  ExtendedDataParamFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExtendedDataParamFindBulkUdtTemplateItem(String id, BSDMSessionContext context, XPDObjectFilter PDFindInIn) {
    super(id, context, "ExtendedDataParamFind");
    PDFindIn = PDFindInIn;
  }

  public void translateToMap() {
    if (PDFindIn != null) {
      Integer index =  PDFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ExtendedDataParam", XPDObjectHelper.toMap(PDFindIn, new HashMap(), "ExtendedDataParam").get("ExtendedDataParam"));
    }
  }


/**
 *
 * Sets the ExtendedDataParam
 * @param PDFindInIn Value of the PDFindIn
 *
 */

  public void setExtendedDataParam(XPDObjectFilter PDFindInIn) {
    PDFindIn = PDFindInIn;
  }

  public void translateFromMap() {
    PDFindIn = XPDObjectHelper.fromMapFilter(inputMap, "ExtendedDataParam");
  }

/**
 *
 * Gets the ExtendedDataParam
 * @return Value of the ExtendedDataParam
 *
 */

  public XPDObjectFilter getExtendedDataParam( ) {
    return PDFindIn;
  }

}
