/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcFindWithExtendedDataBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a NrcFindWithExtendedDataBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcFindWithExtendedDataBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcObjectFilter NFindWithIn;
  protected Boolean ___viewable_only;
/**
 *
 * Constructor to create a  NrcFindWithExtendedDataBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcFindWithExtendedDataBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcObjectFilter NFindWithInIn, Boolean ___viewable_onlyIn) {
    super(id, context, "NrcFindWithExtendedData");
    NFindWithIn = NFindWithInIn;
    ___viewable_only = ___viewable_onlyIn;
  }

  public void translateToMap() {
    if (NFindWithIn != null) {
      Integer index =  NFindWithIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Nrc", NrcObjectHelper.toMap(NFindWithIn, new HashMap(), "Nrc").get("Nrc"));
    }
    if (___viewable_only != null) {
      addInput("ViewableOnly", ___viewable_only);
    }
  }


/**
 *
 * Sets the Nrc
 * @param NFindWithInIn Value of the NFindWithIn
 *
 */

  public void setNrc(NrcObjectFilter NFindWithInIn) {
    NFindWithIn = NFindWithInIn;
  }

/**
 *
 * Sets the ViewableOnly
 * @param ___viewable_onlyIn Value of the ___viewable_only
 *
 */

  public void setViewableOnly(Boolean ___viewable_onlyIn) {
    ___viewable_only = ___viewable_onlyIn;
  }

  public void translateFromMap() {
    NFindWithIn = NrcObjectHelper.fromMapFilter(inputMap, "Nrc");
    ___viewable_only = (Boolean)inputMap.get("ViewableOnly");
  }

/**
 *
 * Gets the Nrc
 * @return Value of the Nrc
 *
 */

  public NrcObjectFilter getNrc( ) {
    return NFindWithIn;
  }

/**
 *
 * Gets the ViewableOnly
 * @return Value of the ViewableOnly
 *
 */

  public Boolean getViewableOnly( ) {
    return ___viewable_only;
  }

}
