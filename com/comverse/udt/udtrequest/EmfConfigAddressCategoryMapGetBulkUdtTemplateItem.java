/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigAddressCategoryMapGetBulkUdtTemplateItem.java
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
 * Class used to create a EmfConfigAddressCategoryMapGetBulkUdtTemplateItem Bulk Template
 *
 */

public class EmfConfigAddressCategoryMapGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EmfConfigAddressCategoryMapObjectKeyData ECACMGetIn;
/**
 *
 * Constructor to create a  EmfConfigAddressCategoryMapGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EmfConfigAddressCategoryMapGetBulkUdtTemplateItem(String id, BSDMSessionContext context, EmfConfigAddressCategoryMapObjectKeyData ECACMGetInIn) {
    super(id, context, "EmfConfigAddressCategoryMapGet");
    ECACMGetIn = ECACMGetInIn;
  }

  public void translateToMap() {
    if (ECACMGetIn != null) {
      ECACMGetIn.resetFlags(true, true);
      addInput("EmfConfigAddressCategoryMap", EmfConfigAddressCategoryMapObjectKeyHelper.toMap(ECACMGetIn, new HashMap(), "EmfConfigAddressCategoryMapObjectKeyData").get("EmfConfigAddressCategoryMapObjectKeyData"));
    }
  }


/**
 *
 * Sets the EmfConfigAddressCategoryMap
 * @param ECACMGetInIn Value of the ECACMGetIn
 *
 */

  public void setEmfConfigAddressCategoryMap(EmfConfigAddressCategoryMapObjectKeyData ECACMGetInIn) {
    ECACMGetIn = ECACMGetInIn;
  }

  public void translateFromMap() {
    ECACMGetIn = EmfConfigAddressCategoryMapObjectKeyHelper.fromMap(inputMap, "EmfConfigAddressCategoryMap");
  }

/**
 *
 * Gets the EmfConfigAddressCategoryMap
 * @return Value of the EmfConfigAddressCategoryMap
 *
 */

  public EmfConfigAddressCategoryMapObjectKeyData getEmfConfigAddressCategoryMap( ) {
    return ECACMGetIn;
  }

}
