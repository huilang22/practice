/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigIdDeleteBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a EmfConfigIdDeleteBulkUdtTemplateItem Bulk Template
 *
 */

public class EmfConfigIdDeleteBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ECIObjectKeyData ECIDeleteIn;
/**
 *
 * Constructor to create a  EmfConfigIdDeleteBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EmfConfigIdDeleteBulkUdtTemplateItem(String id, BSDMSessionContext context, ECIObjectKeyData ECIDeleteInIn) {
    super(id, context, "EmfConfigIdDelete");
    ECIDeleteIn = ECIDeleteInIn;
  }

  public void translateToMap() {
    if (ECIDeleteIn != null) {
      ECIDeleteIn.resetFlags(true, true);
      addInput("EmfConfigId", ECIObjectKeyHelper.toMap(ECIDeleteIn, new HashMap(), "ECIObjectKeyData").get("ECIObjectKeyData"));
    }
  }


/**
 *
 * Sets the EmfConfigId
 * @param ECIDeleteInIn Value of the ECIDeleteIn
 *
 */

  public void setEmfConfigId(ECIObjectKeyData ECIDeleteInIn) {
    ECIDeleteIn = ECIDeleteInIn;
  }

  public void translateFromMap() {
    ECIDeleteIn = ECIObjectKeyHelper.fromMap(inputMap, "EmfConfigId");
  }

/**
 *
 * Gets the EmfConfigId
 * @return Value of the EmfConfigId
 *
 */

  public ECIObjectKeyData getEmfConfigId( ) {
    return ECIDeleteIn;
  }

}
