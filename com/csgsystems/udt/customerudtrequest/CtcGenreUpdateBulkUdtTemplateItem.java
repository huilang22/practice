/*
 * Generated code DO NOT EDIT
 * Generated file: CtcGenreUpdateBulkUdtTemplateItem.java
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
import com.csgsystems.ctc.data.*;

/**
 *
 * Class used to create a CtcGenreUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class CtcGenreUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected CtcGenreObjectData UpdateIn;
/**
 *
 * Constructor to create a  CtcGenreUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public CtcGenreUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, CtcGenreObjectData UpdateInIn) {
    super(id, context, "CtcGenreUpdate");
    UpdateIn = UpdateInIn;
  }

  public void translateToMap() {
    if (UpdateIn != null) {
      UpdateIn.resetFlags(true, true);
      addInput("CtcGenre", CtcGenreObjectHelper.toMap(UpdateIn, new HashMap(), "CtcGenre").get("CtcGenre"));
    }
  }


/**
 *
 * Sets the CtcGenre
 * @param UpdateInIn Value of the UpdateIn
 *
 */

  public void setCtcGenre(CtcGenreObjectData UpdateInIn) {
    UpdateIn = UpdateInIn;
  }

  public void translateFromMap() {
    UpdateIn = CtcGenreObjectHelper.fromMap(inputMap, "CtcGenre");
  }

/**
 *
 * Gets the CtcGenre
 * @return Value of the CtcGenre
 *
 */

  public CtcGenreObjectData getCtcGenre( ) {
    return UpdateIn;
  }

}
