/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositTypeDeleteBulkUdtTemplateItem.java
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
 * Class used to create a DepositTypeDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class DepositTypeDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected DepositTypeObjectKeyData DTDeleteIn;
/**
 *
 * Constructor to create a  DepositTypeDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public DepositTypeDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, DepositTypeObjectKeyData DTDeleteInIn) {
    super(id, context, "DepositTypeDelete");
    DTDeleteIn = DTDeleteInIn;
  }

  public void translateToMap() {
    if (DTDeleteIn != null) {
      DTDeleteIn.resetFlags(true, true);
      addInput("DepositType", DepositTypeObjectKeyHelper.toMap(DTDeleteIn, new HashMap(), "DepositTypeObjectKeyData").get("DepositTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the DepositType
 * @param DTDeleteInIn Value of the DTDeleteIn
 *
 */

  public void setDepositType(DepositTypeObjectKeyData DTDeleteInIn) {
    DTDeleteIn = DTDeleteInIn;
  }

  public void translateFromMap() {
    DTDeleteIn = DepositTypeObjectKeyHelper.fromMap(inputMap, "DepositType");
  }

/**
 *
 * Gets the DepositType
 * @return Value of the DepositType
 *
 */

  public DepositTypeObjectKeyData getDepositType( ) {
    return DTDeleteIn;
  }

}
