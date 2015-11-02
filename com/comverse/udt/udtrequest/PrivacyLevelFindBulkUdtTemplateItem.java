/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrivacyLevelFindBulkUdtTemplateItem.java
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
 * Class used to create a PrivacyLevelFindBulkUdtTemplateItem Bulk Template
 *
 */

public class PrivacyLevelFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected PrivacyLevelObjectFilter PLFindIn;
/**
 *
 * Constructor to create a  PrivacyLevelFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public PrivacyLevelFindBulkUdtTemplateItem(String id, BSDMSessionContext context, PrivacyLevelObjectFilter PLFindInIn) {
    super(id, context, "PrivacyLevelFind");
    PLFindIn = PLFindInIn;
  }

  public void translateToMap() {
    if (PLFindIn != null) {
      Integer index =  PLFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PrivacyLevel", PrivacyLevelObjectHelper.toMap(PLFindIn, new HashMap(), "PrivacyLevel").get("PrivacyLevel"));
    }
  }


/**
 *
 * Sets the PrivacyLevel
 * @param PLFindInIn Value of the PLFindIn
 *
 */

  public void setPrivacyLevel(PrivacyLevelObjectFilter PLFindInIn) {
    PLFindIn = PLFindInIn;
  }

  public void translateFromMap() {
    PLFindIn = PrivacyLevelObjectHelper.fromMapFilter(inputMap, "PrivacyLevel");
  }

/**
 *
 * Gets the PrivacyLevel
 * @return Value of the PrivacyLevel
 *
 */

  public PrivacyLevelObjectFilter getPrivacyLevel( ) {
    return PLFindIn;
  }

}
