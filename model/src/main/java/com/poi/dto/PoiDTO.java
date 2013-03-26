// Generated by http://code.google.com/p/protostuff/ ... DO NOT EDIT!
// Generated from dto.proto

package com.poi.dto;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import com.dyuproject.protostuff.GraphIOUtil;
import com.dyuproject.protostuff.Input;
import com.dyuproject.protostuff.Message;
import com.dyuproject.protostuff.Output;
import com.dyuproject.protostuff.Schema;
import com.dyuproject.protostuff.UninitializedMessageException;

public final class PoiDTO implements Externalizable, Message<PoiDTO>
{

    public static Schema<PoiDTO> getSchema()
    {
        return SCHEMA;
    }

    public static PoiDTO getDefaultInstance()
    {
        return DEFAULT_INSTANCE;
    }

    static final PoiDTO DEFAULT_INSTANCE = new PoiDTO();

    
    // non-private fields
    // see http://developer.android.com/guide/practices/design/performance.html#package_inner
    Long id;
    Double latitude;
    Double longitude;
    String titulo;
    String descricao;
    String detalhes;

    public PoiDTO()
    {
        
    }

    public PoiDTO(
        Double latitude,
        Double longitude
    )
    {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // getters and setters

    // id

    public Long getId()
    {
        return id;
    }

    public PoiDTO setId(Long id)
    {
        this.id = id;
        return this;
    }

    // latitude

    public Double getLatitude()
    {
        return latitude;
    }

    public PoiDTO setLatitude(Double latitude)
    {
        this.latitude = latitude;
        return this;
    }

    // longitude

    public Double getLongitude()
    {
        return longitude;
    }

    public PoiDTO setLongitude(Double longitude)
    {
        this.longitude = longitude;
        return this;
    }

    // titulo

    public String getTitulo()
    {
        return titulo;
    }

    public PoiDTO setTitulo(String titulo)
    {
        this.titulo = titulo;
        return this;
    }

    // descricao

    public String getDescricao()
    {
        return descricao;
    }

    public PoiDTO setDescricao(String descricao)
    {
        this.descricao = descricao;
        return this;
    }

    // detalhes

    public String getDetalhes()
    {
        return detalhes;
    }

    public PoiDTO setDetalhes(String detalhes)
    {
        this.detalhes = detalhes;
        return this;
    }

    // java serialization

    public void readExternal(ObjectInput in) throws IOException
    {
        GraphIOUtil.mergeDelimitedFrom(in, this, SCHEMA);
    }

    public void writeExternal(ObjectOutput out) throws IOException
    {
        GraphIOUtil.writeDelimitedTo(out, this, SCHEMA);
    }

    // message method

    public Schema<PoiDTO> cachedSchema()
    {
        return SCHEMA;
    }

    static final Schema<PoiDTO> SCHEMA = new Schema<PoiDTO>()
    {
        // schema methods

        public PoiDTO newMessage()
        {
            return new PoiDTO();
        }

        public Class<PoiDTO> typeClass()
        {
            return PoiDTO.class;
        }

        public String messageName()
        {
            return PoiDTO.class.getSimpleName();
        }

        public String messageFullName()
        {
            return PoiDTO.class.getName();
        }

        public boolean isInitialized(PoiDTO message)
        {
            return 
                message.latitude != null 
                && message.longitude != null;
        }

        public void mergeFrom(Input input, PoiDTO message) throws IOException
        {
            for(int number = input.readFieldNumber(this);; number = input.readFieldNumber(this))
            {
                switch(number)
                {
                    case 0:
                        return;
                    case 1:
                        message.id = input.readInt64();
                        break;
                    case 2:
                        message.latitude = input.readDouble();
                        break;
                    case 3:
                        message.longitude = input.readDouble();
                        break;
                    case 4:
                        message.titulo = input.readString();
                        break;
                    case 5:
                        message.descricao = input.readString();
                        break;
                    case 6:
                        message.detalhes = input.readString();
                        break;
                    default:
                        input.handleUnknownField(number, this);
                }   
            }
        }


        public void writeTo(Output output, PoiDTO message) throws IOException
        {
            if(message.id != null)
                output.writeInt64(1, message.id, false);

            if(message.latitude == null)
                throw new UninitializedMessageException(message);
            output.writeDouble(2, message.latitude, false);

            if(message.longitude == null)
                throw new UninitializedMessageException(message);
            output.writeDouble(3, message.longitude, false);

            if(message.titulo != null)
                output.writeString(4, message.titulo, false);

            if(message.descricao != null)
                output.writeString(5, message.descricao, false);

            if(message.detalhes != null)
                output.writeString(6, message.detalhes, false);
        }

        public String getFieldName(int number)
        {
            switch(number)
            {
                case 1: return "id";
                case 2: return "latitude";
                case 3: return "longitude";
                case 4: return "titulo";
                case 5: return "descricao";
                case 6: return "detalhes";
                default: return null;
            }
        }

        public int getFieldNumber(String name)
        {
            final Integer number = fieldMap.get(name);
            return number == null ? 0 : number.intValue();
        }

        final java.util.HashMap<String,Integer> fieldMap = new java.util.HashMap<String,Integer>();
        {
            fieldMap.put("id", 1);
            fieldMap.put("latitude", 2);
            fieldMap.put("longitude", 3);
            fieldMap.put("titulo", 4);
            fieldMap.put("descricao", 5);
            fieldMap.put("detalhes", 6);
        }
    };
    
}