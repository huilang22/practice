/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * JurisdictionFindBulkUdtTemplateItem.java
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
 * Class used to create a JurisdictionFindBulkUdtTemplateItem Bulk Template
 *
 */

public class JurisdictionFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected JurisdictionObjectFilter jurFindIn;
/**
 *
 * Constructor to create a  JurisdictionFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public JurisdictionFindBulkUdtTemplateItem(String id, BSDMSessionContext context, JurisdictionObjectFilter jurFindInIn) {
    super(id, context, "JurisdictionFind");
    jurFindIn = jurFindInIn;
  }

  public void translateToMap() {
    if (jurFindIn != null) {
      Integer index =  jurFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Jurisdiction", JurisdictionObjectHelper.toMap(jurFindIn, new HashMap(), "Jurisdiction").get("Jurisdiction"));
    }
  }


/**
 *
 * Sets the Jurisdiction
 * @param jurFindInIn Value of the jurFindIn
 *
 */

  public void setJurisdiction(JurisdictionObjectFilter jurFindInIn) {
    jurFindIn = jurFindInIn;
  }

  public void translateFromMap() {
    jurFindIn = JurisdictionObjectHelper.fromMapFilter(inputMap, "Jurisdiction");
  }

/**
 *
 * Gets the Jurisdiction
 * @return Value of the Jurisdiction
 *
 */

  public JurisdictionObjectFilter getJurisdiction( ) {
    return jurFindIn;
  }

}
