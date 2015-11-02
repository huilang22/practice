/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigIdCreateBulkUdtTemplateItem.java
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
 * Class used to create a EmfConfigIdCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class EmfConfigIdCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ECIObjectData ECICreateIn;
/**
 *
 * Constructor to create a  EmfConfigIdCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EmfConfigIdCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, ECIObjectData ECICreateInIn) {
    super(id, context, "EmfConfigIdCreate");
    ECICreateIn = ECICreateInIn;
  }

  public void translateToMap() {
    if (ECICreateIn != null) {
      ECICreateIn.resetFlags(true, true);
      addInput("EmfConfigId", ECIObjectHelper.toMap(ECICreateIn, new HashMap(), "EmfConfigId").get("EmfConfigId"));
    }
  }


/**
 *
 * Sets the EmfConfigId
 * @param ECICreateInIn Value of the ECICreateIn
 *
 */

  public void setEmfConfigId(ECIObjectData ECICreateInIn) {
    ECICreateIn = ECICreateInIn;
  }

  public void translateFromMap() {
    ECICreateIn = ECIObjectHelper.fromMap(inputMap, "EmfConfigId");
  }

/**
 *
 * Gets the EmfConfigId
 * @return Value of the EmfConfigId
 *
 */

  public ECIObjectData getEmfConfigId( ) {
    return ECICreateIn;
  }

}
