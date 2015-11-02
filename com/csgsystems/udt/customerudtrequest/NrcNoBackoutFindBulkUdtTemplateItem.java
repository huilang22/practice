/*
 * Generated code DO NOT EDIT
 * Generated file: NrcNoBackoutFindBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a NrcNoBackoutFindBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcNoBackoutFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcInvObjectFilter NrcNoBOFindInput;
/**
 *
 * Constructor to create a  NrcNoBackoutFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcNoBackoutFindBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcInvObjectFilter NrcNoBOFindInputIn) {
    super(id, context, "NrcNoBackoutFind");
    NrcNoBOFindInput = NrcNoBOFindInputIn;
  }

  public void translateToMap() {
    if (NrcNoBOFindInput != null) {
      Integer index =  NrcNoBOFindInput.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Nrc", NrcInvObjectHelper.toMap(NrcNoBOFindInput, new HashMap(), "Nrc").get("Nrc"));
    }
  }


/**
 *
 * Sets the Nrc
 * @param NrcNoBOFindInputIn Value of the NrcNoBOFindInput
 *
 */

  public void setNrc(NrcInvObjectFilter NrcNoBOFindInputIn) {
    NrcNoBOFindInput = NrcNoBOFindInputIn;
  }

  public void translateFromMap() {
    NrcNoBOFindInput = NrcInvObjectHelper.fromMapFilter(inputMap, "Nrc");
  }

/**
 *
 * Gets the Nrc
 * @return Value of the Nrc
 *
 */

  public NrcInvObjectFilter getNrc( ) {
    return NrcNoBOFindInput;
  }

}
