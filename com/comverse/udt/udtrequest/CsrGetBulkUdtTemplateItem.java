/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrGetBulkUdtTemplateItem.java
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
 * Class used to create a CsrGetBulkUdtTemplateItem Bulk Template
 *
 */

public class CsrGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CsrObjectKeyData CSRgetIn;
/**
 *
 * Constructor to create a  CsrGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CsrGetBulkUdtTemplateItem(String id, BSDMSessionContext context, CsrObjectKeyData CSRgetInIn) {
    super(id, context, "CsrGet");
    CSRgetIn = CSRgetInIn;
  }

  public void translateToMap() {
    if (CSRgetIn != null) {
      CSRgetIn.resetFlags(true, true);
      addInput("Csr", CsrObjectKeyHelper.toMap(CSRgetIn, new HashMap(), "CsrObjectKeyData").get("CsrObjectKeyData"));
    }
  }


/**
 *
 * Sets the Csr
 * @param CSRgetInIn Value of the CSRgetIn
 *
 */

  public void setCsr(CsrObjectKeyData CSRgetInIn) {
    CSRgetIn = CSRgetInIn;
  }

  public void translateFromMap() {
    CSRgetIn = CsrObjectKeyHelper.fromMap(inputMap, "Csr");
  }

/**
 *
 * Gets the Csr
 * @return Value of the Csr
 *
 */

  public CsrObjectKeyData getCsr( ) {
    return CSRgetIn;
  }

}
