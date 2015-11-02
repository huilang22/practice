/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataParamCreateBulkUdtTemplateItem.java
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
 * Class used to create a ExtendedDataParamCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class ExtendedDataParamCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected XPDObjectData PDCreateIn;
/**
 *
 * Constructor to create a  ExtendedDataParamCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExtendedDataParamCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, XPDObjectData PDCreateInIn) {
    super(id, context, "ExtendedDataParamCreate");
    PDCreateIn = PDCreateInIn;
  }

  public void translateToMap() {
    if (PDCreateIn != null) {
      PDCreateIn.resetFlags(true, true);
      addInput("ExtendedDataParam", XPDObjectHelper.toMap(PDCreateIn, new HashMap(), "ExtendedDataParam").get("ExtendedDataParam"));
    }
  }


/**
 *
 * Sets the ExtendedDataParam
 * @param PDCreateInIn Value of the PDCreateIn
 *
 */

  public void setExtendedDataParam(XPDObjectData PDCreateInIn) {
    PDCreateIn = PDCreateInIn;
  }

  public void translateFromMap() {
    PDCreateIn = XPDObjectHelper.fromMap(inputMap, "ExtendedDataParam");
  }

/**
 *
 * Gets the ExtendedDataParam
 * @return Value of the ExtendedDataParam
 *
 */

  public XPDObjectData getExtendedDataParam( ) {
    return PDCreateIn;
  }

}
