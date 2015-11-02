/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTransDescrFindEligibleBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a NrcTransDescrFindEligibleBulkUdtTemplateItem Bulk Template
 *
 */

public class NrcTransDescrFindEligibleBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityObjectData[] _entity;
  protected NrcTransDescrObjectFilter nrc_trans_descr;
  protected Date _effective_date;
  protected Integer __check_type;
/**
 *
 * Constructor to create a  NrcTransDescrFindEligibleBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public NrcTransDescrFindEligibleBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityObjectData[] _entityIn, NrcTransDescrObjectFilter nrc_trans_descrIn, Date _effective_dateIn, Integer __check_typeIn) {
    super(id, context, "NrcTransDescrFindEligible");
    _entity = _entityIn;
    nrc_trans_descr = nrc_trans_descrIn;
    _effective_date = _effective_dateIn;
    __check_type = __check_typeIn;
  }

  public void translateToMap() {
    if (_entity != null) {
      if (_entity != null) {
        Object[] list = new Object[_entity.length];
        for (int i = 0; i < _entity.length; i++) {
          list[i] = EntityObjectHelper.getMap(_entity[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "NrcTransDescr");
        }
        addInput("EntityList", list);
      }
    }
    if (nrc_trans_descr != null) {
      Integer index =  nrc_trans_descr.getIndex();
      if (index != null) addInput("Index", index);
      addInput("NrcTransDescr", NrcTransDescrObjectHelper.toMap(nrc_trans_descr, new HashMap(), "NrcTransDescr").get("NrcTransDescr"));
    }
    if (_effective_date != null) {
      addInput("EffectiveDate", _effective_date);
    }
    if (__check_type != null) {
      addInput("CheckType", __check_type);
    }
  }


/**
 *
 * Sets the Entity
 * @param _entityIn Value of the _entity
 *
 */

  public void setEntity(EntityObjectData[] _entityIn) {
    _entity = _entityIn;
  }

/**
 *
 * Sets the NrcTransDescr
 * @param nrc_trans_descrIn Value of the nrc_trans_descr
 *
 */

  public void setNrcTransDescr(NrcTransDescrObjectFilter nrc_trans_descrIn) {
    nrc_trans_descr = nrc_trans_descrIn;
  }

/**
 *
 * Sets the EffectiveDate
 * @param _effective_dateIn Value of the _effective_date
 *
 */

  public void setEffectiveDate(Date _effective_dateIn) {
    _effective_date = _effective_dateIn;
  }

/**
 *
 * Sets the CheckType
 * @param __check_typeIn Value of the __check_type
 *
 */

  public void setCheckType(Integer __check_typeIn) {
    __check_type = __check_typeIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("EntityList");
    if (list != null) {
      _entity = new EntityObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        _entity[i] = EntityObjectHelper.getObj((Map) list[i]);
        _entity[i].resetFlags(true, true);
      }
    }
    nrc_trans_descr = NrcTransDescrObjectHelper.fromMapFilter(inputMap, "NrcTransDescr");
    _effective_date = (Date)inputMap.get("EffectiveDate");
    __check_type = (Integer)inputMap.get("CheckType");
  }

/**
 *
 * Gets the Entity
 * @return Value of the Entity
 *
 */

  public EntityObjectData[] getEntity( ) {
    return _entity;
  }

/**
 *
 * Gets the NrcTransDescr
 * @return Value of the NrcTransDescr
 *
 */

  public NrcTransDescrObjectFilter getNrcTransDescr( ) {
    return nrc_trans_descr;
  }

/**
 *
 * Gets the EffectiveDate
 * @return Value of the EffectiveDate
 *
 */

  public Date getEffectiveDate( ) {
    return _effective_date;
  }

/**
 *
 * Gets the CheckType
 * @return Value of the CheckType
 *
 */

  public Integer getCheckType( ) {
    return __check_type;
  }

}
