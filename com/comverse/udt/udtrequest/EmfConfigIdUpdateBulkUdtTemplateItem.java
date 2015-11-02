/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigIdUpdateBulkUdtTemplateItem.java
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
 * Class used to create a EmfConfigIdUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class EmfConfigIdUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ECIObjectData ECIUpdateIn;
/**
 *
 * Constructor to create a  EmfConfigIdUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EmfConfigIdUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, ECIObjectData ECIUpdateInIn) {
    super(id, context, "EmfConfigIdUpdate");
    ECIUpdateIn = ECIUpdateInIn;
  }

  public void translateToMap() {
    if (ECIUpdateIn != null) {
      ECIUpdateIn.resetFlags(true, true);
      addInput("EmfConfigId", ECIObjectHelper.toMap(ECIUpdateIn, new HashMap(), "EmfConfigId").get("EmfConfigId"));
    }
  }


/**
 *
 * Sets the EmfConfigId
 * @param ECIUpdateInIn Value of the ECIUpdateIn
 *
 */

  public void setEmfConfigId(ECIObjectData ECIUpdateInIn) {
    ECIUpdateIn = ECIUpdateInIn;
  }

  public void translateFromMap() {
    ECIUpdateIn = ECIObjectHelper.fromMap(inputMap, "EmfConfigId");
  }

/**
 *
 * Gets the EmfConfigId
 * @return Value of the EmfConfigId
 *
 */

  public ECIObjectData getEmfConfigId( ) {
    return ECIUpdateIn;
  }

}
