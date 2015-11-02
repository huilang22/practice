/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigAddressCategoryMapFindBulkUdtTemplateItem.java
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
 * Class used to create a EmfConfigAddressCategoryMapFindBulkUdtTemplateItem Bulk Template
 *
 */

public class EmfConfigAddressCategoryMapFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EmfConfigAddressCategoryMapObjectFilter ECACMFindIn;
/**
 *
 * Constructor to create a  EmfConfigAddressCategoryMapFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public EmfConfigAddressCategoryMapFindBulkUdtTemplateItem(String id, BSDMSessionContext context, EmfConfigAddressCategoryMapObjectFilter ECACMFindInIn) {
    super(id, context, "EmfConfigAddressCategoryMapFind");
    ECACMFindIn = ECACMFindInIn;
  }

  public void translateToMap() {
    if (ECACMFindIn != null) {
      Integer index =  ECACMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("EmfConfigAddressCategoryMap", EmfConfigAddressCategoryMapObjectHelper.toMap(ECACMFindIn, new HashMap(), "EmfConfigAddressCategoryMap").get("EmfConfigAddressCategoryMap"));
    }
  }


/**
 *
 * Sets the EmfConfigAddressCategoryMap
 * @param ECACMFindInIn Value of the ECACMFindIn
 *
 */

  public void setEmfConfigAddressCategoryMap(EmfConfigAddressCategoryMapObjectFilter ECACMFindInIn) {
    ECACMFindIn = ECACMFindInIn;
  }

  public void translateFromMap() {
    ECACMFindIn = EmfConfigAddressCategoryMapObjectHelper.fromMapFilter(inputMap, "EmfConfigAddressCategoryMap");
  }

/**
 *
 * Gets the EmfConfigAddressCategoryMap
 * @return Value of the EmfConfigAddressCategoryMap
 *
 */

  public EmfConfigAddressCategoryMapObjectFilter getEmfConfigAddressCategoryMap( ) {
    return ECACMFindIn;
  }

}
