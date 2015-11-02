/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTypeGroupUpdateBulkUdtTemplateItem.java
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
 * Class used to create a NrcTypeGroupUpdateBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcTypeGroupUpdateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected NrcTypeGroupObjectData NTGUpdIn;
  protected NrcTypeGroupObjectFilter NTGUpdateFilter;
  protected NrcTypeGroupObjectData NTGUpdGet;
/**
 *
 * Constructor to create a  NrcTypeGroupUpdateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcTypeGroupUpdateBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcTypeGroupObjectData NTGUpdInIn, NrcTypeGroupObjectFilter NTGUpdateFilterIn, NrcTypeGroupObjectData NTGUpdGetIn) {
    super(id, context, "NrcTypeGroupUpdate");
    NTGUpdIn = NTGUpdInIn;
    NTGUpdateFilter = NTGUpdateFilterIn;
    NTGUpdGet = NTGUpdGetIn;
  }

  public void translateToMap() {
    if (NTGUpdIn != null) {
      NTGUpdIn.resetFlags(true, true);
      addInput("NrcTypeGroup", NrcTypeGroupObjectHelper.toMap(NTGUpdIn, new HashMap(), "NrcTypeGroup").get("NrcTypeGroup"));
    }
    if (NTGUpdateFilter != null) {
      Integer index =  NTGUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NTGUpdateFilter", NrcTypeGroupObjectHelper.toMap(NTGUpdateFilter, new HashMap(), "NrcTypeGroup").get("NrcTypeGroup"));
    }
    if (NTGUpdGet != null) {
      NTGUpdGet.resetFlags(true, true);
      addInput("NTGUpdGet", NrcTypeGroupObjectHelper.toMap(NTGUpdGet, new HashMap(), "NrcTypeGroup").get("NrcTypeGroup"));
    }
  }


/**
 *
 * Sets the NrcTypeGroup
 * @param NTGUpdInIn Value of the NTGUpdIn
 *
 */

  public void setNrcTypeGroup(NrcTypeGroupObjectData NTGUpdInIn) {
    NTGUpdIn = NTGUpdInIn;
  }

/**
 *
 * Sets the NTGUpdateFilter
 * @param NTGUpdateFilterIn Value of the NTGUpdateFilter
 *
 */

  public void setNTGUpdateFilter(NrcTypeGroupObjectFilter NTGUpdateFilterIn) {
    NTGUpdateFilter = NTGUpdateFilterIn;
  }

/**
 *
 * Sets the NTGUpdGet
 * @param NTGUpdGetIn Value of the NTGUpdGet
 *
 */

  public void setNTGUpdGet(NrcTypeGroupObjectData NTGUpdGetIn) {
    NTGUpdGet = NTGUpdGetIn;
  }

  public void translateFromMap() {
    NTGUpdIn = NrcTypeGroupObjectHelper.fromMap(inputMap, "NrcTypeGroup");
    NTGUpdateFilter = NrcTypeGroupObjectHelper.fromMapFilter(inputMap, "NTGUpdateFilter");
    NTGUpdGet = NrcTypeGroupObjectHelper.fromMap(inputMap, "NTGUpdGet");
  }

/**
 *
 * Gets the NrcTypeGroup
 * @return Value of the NrcTypeGroup
 *
 */

  public NrcTypeGroupObjectData getNrcTypeGroup( ) {
    return NTGUpdIn;
  }

/**
 *
 * Gets the NTGUpdateFilter
 * @return Value of the NTGUpdateFilter
 *
 */

  public NrcTypeGroupObjectFilter getNTGUpdateFilter( ) {
    return NTGUpdateFilter;
  }

/**
 *
 * Gets the NTGUpdGet
 * @return Value of the NTGUpdGet
 *
 */

  public NrcTypeGroupObjectData getNTGUpdGet( ) {
    return NTGUpdGet;
  }

}
