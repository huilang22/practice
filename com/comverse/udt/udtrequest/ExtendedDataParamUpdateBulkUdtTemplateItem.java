/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataParamUpdateBulkUdtTemplateItem.java
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
 * Class used to create a ExtendedDataParamUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class ExtendedDataParamUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected XPDObjectData PDUpdateIn;
/**
 *
 * Constructor to create a  ExtendedDataParamUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ExtendedDataParamUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, XPDObjectData PDUpdateInIn) {
    super(id, context, "ExtendedDataParamUpdate");
    PDUpdateIn = PDUpdateInIn;
  }

  public void translateToMap() {
    if (PDUpdateIn != null) {
      PDUpdateIn.resetFlags(true, true);
      addInput("ExtendedDataParam", XPDObjectHelper.toMap(PDUpdateIn, new HashMap(), "ExtendedDataParam").get("ExtendedDataParam"));
    }
  }


/**
 *
 * Sets the ExtendedDataParam
 * @param PDUpdateInIn Value of the PDUpdateIn
 *
 */

  public void setExtendedDataParam(XPDObjectData PDUpdateInIn) {
    PDUpdateIn = PDUpdateInIn;
  }

  public void translateFromMap() {
    PDUpdateIn = XPDObjectHelper.fromMap(inputMap, "ExtendedDataParam");
  }

/**
 *
 * Gets the ExtendedDataParam
 * @return Value of the ExtendedDataParam
 *
 */

  public XPDObjectData getExtendedDataParam( ) {
    return PDUpdateIn;
  }

}
